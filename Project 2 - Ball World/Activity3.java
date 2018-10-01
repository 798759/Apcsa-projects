
/**
 * Write a description of class Activity2 here.
 * changewsx dsahji grsgjn ejm'g; n'rkegn 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity3
{
    public static void run()
    { 
        BallWorld ballworld = new BallWorld(250,250);
        TGPoint tgpoint = new TGPoint (0,0); 
        BallBot ballbot = new BallBot (ballworld,tgpoint,0,10);
        double x;

        while (true){
            if (ballbot.canMoveForward(ballworld)){
                ballbot.moveForward();
            }else{
                x = Math.random()*360;
                ballbot.setHeading(x);

            }
        }
    }

    public int findFreeBallBotIndex(BallBot[] ballbotArray){
        for(int v =0; v<ballbotArray.length; v++){
            if (ballbotArray[v]==null) return v;

        }
        return ballbotArray.length;
    }

    public static void a2() {
        Activity3 thisClass = new  Activity3();
        int freeballBotArray[];
        int freeBallBotIndex;
        BallBot[] ballBotArray = new BallBot[10];
        TGPoint findFreeBallBotIndex = new TGPoint();
        BallWorld ballworld = new BallWorld(250,250);
        TGPoint tgpoint = new TGPoint (0,0); 
        
        double x=0;
        BallBot currBallBot;

        while (true){
            if (thisClass.findFreeBallBotIndex(ballBotArray) < ballBotArray.length){
                int freeballbotindex = thisClass.findFreeBallBotIndex(ballBotArray);
                ballBotArray[thisClass.findFreeBallBotIndex(ballBotArray)]= new BallBot(ballworld,tgpoint,0,10);
                System.out.println("what we care about: "+freeballbotindex);

            }
            for(int b =0; b<thisClass.findFreeBallBotIndex(ballBotArray); b++) {
                //System.out.println("hi");
                currBallBot = ballBotArray[b];
                System.out.println(ballworld);
                System.out.println("currBallBot: "+currBallBot);
                if (!(currBallBot==null)){
                    if  (currBallBot.canMoveForward(ballworld)){
                        currBallBot.moveForward();
                    }else{
                        x = Math.random()*360;
                        currBallBot.setHeading(x);

                    }
                }
            }
        }
    }
}
