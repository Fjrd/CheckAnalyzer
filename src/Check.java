import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

public class Check {
    Long dateTime;
    Integer ecashTotalSum;
    Integer cashTotalSum;
    Long fiscalDocumentNumber;
    Long fiscalDriveNumber;
    Long fiscalSign;
    ArrayList<Item> items;

    public void toScreen(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Check{" +
                "\n\tdateTime=" + new Date(dateTime) +
                ", \n\tecashTotalSum=" + ecashTotalSum / 100 + " руб" +
                ", \n\tcashTotalSum=" + cashTotalSum / 100 + " руб"+
                ", \n\tfiscalDocumentNumber=" + fiscalDocumentNumber +
                ", \n\tfiscalDriveNumber=" + fiscalDriveNumber +
                ", \n\tfiscalSign=" + fiscalSign +
                ", \n\titems=" + items +
                '}';
    }
}
