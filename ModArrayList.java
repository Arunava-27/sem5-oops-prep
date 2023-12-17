import java.util.ArrayList;

public class ModArrayList<DataType> extends ArrayList<DataType> {

    public DataType getUsingMod(int index){
        int modIndex = Math.abs(index) % this.size();
        return this.get(modIndex);
    }
}