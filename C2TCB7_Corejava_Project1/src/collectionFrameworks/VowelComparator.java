package collectionFrameworks;
import java.util.Comparator;


public class VowelComparator implements Comparator<String> {
	

	@Override
	public int compare(String x, String y) {
		if (getVowelCount(x)< getVowelCount(y)) {
			return -1;
		}else if( )
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
