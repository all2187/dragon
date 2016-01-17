import java.util.Date;



public class UserSelection
{
	private Date calendarDate;
	private int periodLength;
	private boolean mentionsOfCompanyOnSocialMedia;
	private boolean nationalEvents;
	private boolean internationalEvents;
	private boolean ecDataShifts;
	private boolean stockValueShifts;
	
	public UserSelection(Date calendarDate, int periodLength, 
				boolean mentionsOfCompanyOnSocialMedia,
				boolean nationalEvents,
				boolean internationalEvents,
				boolean ecDataShifts,
				boolean stockValueShifts)
	{
		this.calendarDate = calendarDate;
		this.periodLength = periodLength;
		this.mentionsOfCompanyOnSocialMedia = mentionsOfCompanyOnSocialMedia;
		this.nationalEvents = nationalEvents;
		this.internationalEvents = internationalEvents;
		this.ecDataShifts = ecDataShifts;
		this.stockValueShifts = stockValueShifts;
	}

	public Date getCalendarDate() {
		return calendarDate;
	}

	public int getPeriodLength() {
		return periodLength;
	}

	public boolean isMentionsOfCompanyOnSocialMedia() {
		return mentionsOfCompanyOnSocialMedia;
	}

	public boolean isNationalEvents() {
		return nationalEvents;
	}

	public boolean isInternationalEvents() {
		return internationalEvents;
	}


	public boolean isEcDataShifts() {
		return ecDataShifts;
	}

	public boolean isStockValueShifts() {
		return stockValueShifts;
	}
	
	public String toString()
	{
		return	"Period length is: " + periodLength +
				"\nDate is: " + calendarDate +
				"\nMentions of company on social media: " + mentionsOfCompanyOnSocialMedia +
				"\nNational events: " + nationalEvents +
				"\nInternational events: " + internationalEvents +
				"\nEconomic Data Shift: " + ecDataShifts +
				"\nStock Value Shift: " + stockValueShifts + "\n\n";
	}


}