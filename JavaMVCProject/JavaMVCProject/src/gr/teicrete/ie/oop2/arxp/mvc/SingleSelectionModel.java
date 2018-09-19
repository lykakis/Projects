package gr.teicrete.ie.oop2.arxp.mvc;

/**
 *
 * @author PK5
 */
public class SingleSelectionModel {

    private static final String[] values = {"Mhden", "Ena", "Dyo", "Tria"};
    private int selectedIndex;

    public SingleSelectionModel(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }
    
    public int getSelectedIndex() {
        return selectedIndex;
    }

    protected void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }
    
    public static String[] getValues() {
        return values;
    }    
}
