package Unguided;
import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<EksperimenModel> {
    @Override
    public int compare(EksperimenModel e1, EksperimenModel e2) {
        return Integer.compare(e1.getWaktuTraining(), e2.getWaktuTraining());
    }
}
