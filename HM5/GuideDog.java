package ua.od.hillel;

public class GuideDog extends Homes {
    private String goHome;
    private boolean isTrained = true;

    public GuideDog(int id, int age, int weight, String color) {
        super(id, age, weight, color, "GuideDog");
    }

        public static String getVoice () {
            return "I can take you home.";
        }
        public void getGoHome () {
            System.out.println("Go home HUMAN!");
        }
        public boolean isTrained () {
            return isTrained;
        }
        public void setTrained ( boolean trained){
            isTrained = trained;
        }
    }
