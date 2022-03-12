package Components;

import java.util.ArrayList;
import java.util.List;

public class Oppilaat {

    List<IOppilaat> oppilaat = new ArrayList<>();
    
    public void addoppilas(IOppilaat oppilas){
        oppilaat.add(oppilas);
    }
    
    public void startAllOppilaat(){
        for(IOppilaat m : oppilaat){
            m.startOppilaat();
        }
    }
    public void stopAllOppilaat(){
        for(IOppilaat m : oppilaat){
            m.stopOppilaat();
        }
    }

}
 