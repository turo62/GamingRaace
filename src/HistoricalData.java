import java.util.List;
import java.util.ArrayList;

public class HistoricalData {
    private List<Horses> horses = new ArrayList<Horses>();
    private int size;

    public void setHorses() {
        this.horses = horses;
    }

    public List<Horses> getHorses() {
        return this.horses;
    }

    public void setSize() {
        this.size = horses.size();
    }

    public int getSize() {
        return size;
    }

    public List addItem() {
        horses.add(new Horses("Vakló"));
        horses.add(new Horses("Háromláb"));
        horses.add(new Horses("Béna"));
        horses.add(new Horses("Sánta"));
        horses.add(new Horses("Mérges"));
        horses.add(new Horses("Nagycsődör"));
        horses.add(new Horses("Bukó"));
        horses.add(new Horses("Nyeretlen"));
        return horses;
    }

}
