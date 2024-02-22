/**
 * 
 */
package in.jeani.learning.sb.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;

import org.springframework.stereotype.Service;

import in.jeani.learning.sb.data.FxDataItem;

/**
 * 
 */
@Service
public class DataLoadService {

	private static final String CSV_FILE = "DAT_ASCII_USDJPY_T_202402.csv";
	
	public void loadData() {
		Path filePath = Path.of(CSV_FILE);
		File f = new File(CSV_FILE);
		System.out.println("Reading file from path: " + f.getAbsolutePath());
		FxDataItem leastInOpenItem = new FxDataItem();
		FxDataItem highestInOpenItem = new FxDataItem();
		
		Consumer<FxDataItem> findHighLow = (item) -> {
			if (null == leastInOpenItem.getOpenPrice() || leastInOpenItem.getOpenPrice() > item.getOpenPrice()) {
				leastInOpenItem.setOpenPrice(item.getOpenPrice());
				leastInOpenItem.setClosePrice(item.getClosePrice());
				leastInOpenItem.setTickDateTime(item.getTickDateTime());
			} 
			if (null == highestInOpenItem.getOpenPrice()  || highestInOpenItem.getOpenPrice() < item.getOpenPrice()) {
				highestInOpenItem.setOpenPrice(item.getOpenPrice());
				highestInOpenItem.setClosePrice(item.getClosePrice());
				highestInOpenItem.setTickDateTime(item.getTickDateTime());
			}
		};
		
		try {
			Files.lines(filePath)
				.map(line -> {
					String[] row = line.split(",");
					FxDataItem fxItem = new FxDataItem();
					fxItem.setTickDateTime(row[0]);
					fxItem.setOpenPrice(Double.valueOf(row[1]));
					fxItem.setClosePrice(Double.valueOf(row[2]));
					return fxItem;
				})
				.forEach(findHighLow);
			
			System.out.println("Highest: " + highestInOpenItem);
			System.out.println("Lowest : " + leastInOpenItem);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
