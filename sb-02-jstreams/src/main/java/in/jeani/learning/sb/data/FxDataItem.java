/**
 * 
 */
package in.jeani.learning.sb.data;

/**
 * 
 */
public class FxDataItem {
	
	private String tickDateTime;
	private Double openPrice;
	private Double closePrice;
	
	public String getTickDateTime() {
		return tickDateTime;
	}
	public void setTickDateTime(String tickDateTime) {
		this.tickDateTime = tickDateTime;
	}
	public Double getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(Double openPrice) {
		this.openPrice = openPrice;
	}
	public Double getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(Double closePrice) {
		this.closePrice = closePrice;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.tickDateTime);
		sb.append(" | OPEN | ").append(this.openPrice);
		sb.append(" | CLOSE | ").append(this.closePrice);
		
		return sb.toString();
	}
	
}
