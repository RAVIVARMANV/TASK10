package task10;

public class Teamain {

	public static void main(String[] args) {
		Tea[] teaArray = {new Tea(),new Greentea(),new blacktea()};

	        for (Tea tea : teaArray) {
	            tea.preparetea();
	        }
	}

}
