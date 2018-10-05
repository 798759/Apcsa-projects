

/**
 * Write a description of class Activity2 here.
 * changewsx dsahji grsgjn ejm'g; n'rkegn 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity4
{
    public static void run()
    { 
        
        //activity 4 github test~!!!1
        BallWorld ballworld = new BallWorld(250,250);
        TGPoint tgpoint = new TGPoint (0,0); 
        BallBot ballbot = new BallBot (ballworld,tgpoint,0,10);
        double x;

        while (true){
            if (ballbot.canMoveForward(ballworld)){//checks if ball can move
                ballbot.moveForward();// moves ball
            }else{
                x = Math.random()*360;//if cant move change direction
                ballbot.setHeading(x);

            }
        }
    }

    public int findFreeBallBotIndex(BallBot[] ballbotArray){
        for(int v =0; v<ballbotArray.length; v++){// check each spot in array
            if (ballbotArray[v]==null) return v;//checks if any are null

        }
        return ballbotArray.length;// if there are no nulls return length
    }

    public double distanceBetweenPoints(TGPoint point1, TGPoint point2){// finds distance
        return Math.sqrt((Math.pow(point1.x-point2.x,2))+(Math.pow(point1.y-point2.y,2)));
    }

    public boolean entranceClear(BallBot[] ballBotArray, TGPoint entrancePoint){// checks if entrance is clear

       
        for(int b =0; b<ballBotArray.length; b++){
            if (!(ballBotArray[b]==null)){// if spot in array is not null
                BallBot ballBot = ballBotArray[b];//load it 
                if (distanceBetweenPoints(entrancePoint, ballBot.getPoint()) < ballBot.getRadius() * 3) return false;

            }
        }
        return true;
    }
 public BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray){
         TGPoint point = ballBot.getPoint();
         TGPoint secondPoint = ballBot.forwardPoint();
         Activity3 thisClass = new  Activity3();
         BallBot ret = null;
         for(int b =0; b<ballBotArray.length; b++){
             BallBot otherBallBot = ballBotArray[b];
             if (otherBallBot!=null&&otherBallBot!=ballBot){
                 double currentDistance = distanceBetweenPoints(ballBot.getPoint(), otherBallBot.getPoint());
                 if (currentDistance <= (ballBot.getRadius()+otherBallBot.getRadius())){
                     double nextDistance = distanceBetweenPoints(secondPoint, otherBallBot.getPoint());
                     if ( nextDistance <= currentDistance){
                         ret = otherBallBot;
                        }
                     
                    }
                }
            }
            return ret;
        }
    public static void a3() {
        int freeballBotArray[];
        int freeBallBotIndex;
        BallBot[] ballBotArray = new BallBot[10];
        TGPoint findFreeBallBotIndex = new TGPoint();
        BallWorld ballworld = new BallWorld(250,250);
        TGPoint tgpoint = new TGPoint (0,0); 
        Activity4 thisClass = new Activity4();
        double x=0;
        BallBot currBallBot;

        while (true){
            if ((thisClass.findFreeBallBotIndex(ballBotArray) < ballBotArray.length) && ((thisClass.entranceClear(ballBotArray, tgpoint)))){
               
                ballBotArray[thisClass.findFreeBallBotIndex(ballBotArray)]= new BallBot(ballworld,tgpoint,0,10);

            }
            for(int b =0; b<thisClass.findFreeBallBotIndex(ballBotArray); b++) {// if there is room and the index
                //System.out.println("hi");
                currBallBot = ballBotArray[b];
                    if ((currBallBot!=null)){// if a ballbot exists 
                        if  (currBallBot.canMoveForward(ballworld)){// if can move forward
                            if (thisClass.ballBotToBounceOff(currBallBot, ballBotArray) == null){
                            currBallBot.moveForward();
                            }else{
                                x = Math.random()*360;// if cant change direction
                            currBallBot.setHeading(x);
                        }
                        }else{
                            x = Math.random()*360;// if cant change direction
                            currBallBot.setHeading(x);

                        }
                    }
                }
            }
        }
     
    }
