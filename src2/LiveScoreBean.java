package src2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LiveScoreBean {
    private String scoreLine;
    private PropertyChangeSupport support;

    public LiveScoreBean() {
        support = new PropertyChangeSupport(this);
    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String newScoreLine) {
        String oldScoreLine = this.scoreLine;
        this.scoreLine = newScoreLine;
        support.firePropertyChange("scoreLine", oldScoreLine, newScoreLine);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}
