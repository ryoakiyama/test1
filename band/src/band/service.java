package band;

public class service {
    private final static int BOYS = 1;
    private final static int GIRLS = 2;
    public String CheckBandType(BandInfoDto bandInfo){
        int bandType = bandInfo.getBandType();
        switch(bandType){
        case BOYS:
            return "やろばん";
        case GIRLS:
            return "ギャルバン";
        default:
            return "混声";
        }
    }
}