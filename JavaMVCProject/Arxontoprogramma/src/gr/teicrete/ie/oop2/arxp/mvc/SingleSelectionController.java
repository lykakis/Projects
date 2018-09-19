package gr.teicrete.ie.oop2.arxp.mvc;

import java.util.ArrayList;

/**
 *
 * @author PK5
 */
public class SingleSelectionController {

    private SingleSelectionModel singleSelectionModel;
    private ArrayList<SingleSelectionView> currentViews;

    public SingleSelectionController(SingleSelectionModel singleSelectionModel) {
        this.singleSelectionModel = singleSelectionModel;
        currentViews = new ArrayList<>();
    }

    public SingleSelectionController(int selectedIndex) {
        this(new SingleSelectionModel(selectedIndex));
    }

    public SingleSelectionController() {
        this(new SingleSelectionModel(1));
    }

    public void registerSingleSelectionView(SingleSelectionView singleSelectionView) {
        currentViews.add(singleSelectionView);
    }

    public void unregisterSingleSelectionView(SingleSelectionView singleSelectionView) {
        currentViews.remove(singleSelectionView);
    }
    
    public String[] getInitialModelValues(){
        return SingleSelectionModel.getValues();
    }
    
    public int getSelectedIndex(){
        return singleSelectionModel.getSelectedIndex();
    }
    
    public void setSelectedIndex(SingleSelectionView evtSrc, int selectedIndex){
        singleSelectionModel.setSelectedIndex(selectedIndex);
        for (int i = 0; i < currentViews.size(); i++) {
            if(currentViews.get(i)!=evtSrc){
                currentViews.get(i).selectionChangedAction(selectedIndex);
            }
        }
    }
}
