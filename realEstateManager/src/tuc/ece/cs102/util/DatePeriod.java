package tuc.ece.cs102.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePeriod {

	private Date start;
	private Date end;
	
	
	public DatePeriod(Date pStart, Date pEnd) {
		this.start = pStart;
		this.end=pEnd;
	}


	public Date getStart() {
		return start;
	}


	public void setStart(Date pStart) {
		this.start = pStart;
	}


	public Date getEnd() {
		return end;
	}


	public void setEnd(Date pEnd) {
		this.end = pEnd;
	}
	
	
	public boolean overlaps(DatePeriod p) {
		if ((this.start.equals(p.getStart()) || this.start.before(p.getStart())) && (!this.end.before(p.getStart()))){
			return true;
		}else if ((this.start.equals(p.getStart()) || p.getStart().before(this.start)) && !p.getEnd().before(this.start)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int toDays() {
		if (this.start.before(this.end)) {
			long diff = this.end.getTime() - this.start.getTime();
			return (int) (diff / (24 * 60 * 60 * 1000));
		}else {
			return 0;
		}			
	}
	
	public String toString() {
		String result="";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		result += "from ";
		result += sdf.format(this.start);
		result += " to ";
		result += sdf.format(this.end);		
		return result;
	}
	
	public String toRangeString() {
		String result="[";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		result += sdf.format(this.start);
		result += " - ";
		result += sdf.format(this.end) +"]";		
		return result;
	}
}
