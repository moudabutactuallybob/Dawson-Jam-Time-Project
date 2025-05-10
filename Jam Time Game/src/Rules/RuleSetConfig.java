package Rules;

import Enumerations.Genre;
import Enumerations.Type;

public class RuleSetConfig {

    private final Genre rules;
    private final int[] points;

    public RuleSetConfig(Genre rules) {
        this.rules = rules;

        this.points = new int[]{rules.getGUITAR_POINTS(), rules.getDRUMS_POINTS(), rules.getBASS_POINTS(), rules.getKEYBOARD_POINTS(), rules.getSTRING_IN_POINTS(), rules.getWIND_IN_POINTS(), rules.getJAM_TIME_POINTS(), rules.getPICK_MULTIPLIER()};
    }

    public int findIndex(Type card){
        int index = 0;

        for(Type type: Type.values()){
            if((type.getId()) - 1 == index){
               break;
            } else {
                index++;
            }
        }
        return index;
    }

    public int getPoints(Type card) {
        int index = findIndex(card);
        int points = this.points[index];

        return points;
    }
}
