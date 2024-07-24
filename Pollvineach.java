WorldPoint save_1 = new WorldPoint(3351, 2962, 0);
int lap_1 = 14935;
WorldPoint post_lap_1 = new WorldPoint(3351, 2964, 1); 
int lap_2 = 14936;
WorldPoint lap_2_grace = new WorldPoint(3356, 2978, 1); 
int lap_3 = 14937;
WorldPoint post_lap_2 = new WorldPoint(3352, 2973, 1); 
WorldPoint lap_3_grace = new WorldPoint(3501, 3505, 1); 
int lap_4 = 14938;
WorldPoint post_lap_3 = new WorldPoint(3360, 2977, 1); 
WorldPoint lap_4_grace = new WorldPoint(3490, 3501, 1); 
int lap_5 = 14939;
WorldPoint post_lap_4 = new WorldPoint(3366, 2976, 1); 
WorldPoint lap_5_grace = new WorldPoint(3478, 3496, 1); 
int lap_6 = 14940;
WorldPoint post_lap_5 = new WorldPoint(3368, 2982, 1); 
WorldPoint lap_6_grace = new WorldPoint(3359, 2983, 2); 
int lap_7 = 14847;
WorldPoint post_lap_6 = new WorldPoint(3365, 2983, 2); 
int lap_8 = 14897;
WorldPoint post_lap_7 = new WorldPoint(3510, 3476, 2); 
int graceId = 11849;
int opBlock = 3;
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();
GameObject treeLap = v.getGameObject().findNearest(lap_1);

if (client.getEnergy() >= 2000) {
    v.getWalking().turnRunningOn();
}
private void pickUpGrace(){

 if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
    v.getGroundItem().take(graceId);
    }
}

 if (treeLap != null && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {    
            int treeLapSceneX = treeLap.getSceneMinLocation().getX();
            int treeLapSceneY = treeLap.getSceneMinLocation().getY();
            if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
                v.invoke("Climb","<col=ffff>Basket",lap_1,3,treeLapSceneX,treeLapSceneY,false);

             }
}
else if (treeLap == null && (currentLocation.equals(post_lap_1)  || currentLocation.equals(lap_2_grace)) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning())) {
            GameObject jumpLap = v.getGameObject().findNearest(lap_2);
            int jumpLapSceneX = jumpLap.getSceneMinLocation().getX();
            int jumpLapSceneY = jumpLap.getSceneMinLocation().getY();
            if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
            else {
            v.invoke("Jump","<col=ffff>Market stall",lap_2,opBlock,jumpLapSceneX,jumpLapSceneY,false);
            }
}
else if (treeLap == null && (currentLocation.equals(post_lap_2) || currentLocation.equals(lap_3_grace)) && v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
        
            GameObject jumpLap2 = v.getGameObject().findNearest(lap_3);
            int jumpLap2SceneX = jumpLap2.getSceneMinLocation().getX();
            int jumpLap2SceneY = jumpLap2.getSceneMinLocation().getY();
              if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Grab","<col=ffff>Banner",lap_3,opBlock,jumpLap2SceneX,jumpLap2SceneY,false);
            }
}
else if (treeLap == null && (currentLocation.equals(post_lap_3) || currentLocation.equals(lap_4_grace))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
            GameObject jumpLap3 = v.getGameObject().findNearest(lap_4);
            int jumpLap3SceneX = jumpLap3.getSceneMinLocation().getX();
            int jumpLap3SceneY = jumpLap3.getSceneMinLocation().getY();
             if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Jump","<col=ffff>Gap",lap_4,opBlock,jumpLap3SceneX,jumpLap3SceneY,false);
            }
}
else if (treeLap == null && (currentLocation.equals(post_lap_4) || currentLocation.equals(lap_5_grace))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
            GameObject jumpLap4 = v.getGameObject().findNearest(lap_5);
            int jumpLap4SceneX = jumpLap4.getSceneMinLocation().getX();
            int jumpLap4SceneY = jumpLap4.getSceneMinLocation().getY();
                        if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Jump","<col=ffff>Tree",lap_5,opBlock,jumpLap4SceneX,jumpLap4SceneY,false);
            }
}
else if (treeLap == null && (currentLocation.equals(post_lap_5) || currentLocation.equals(lap_6_grace))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
            GameObject jumpLap5 = v.getGameObject().findNearest(lap_6);
            int jumpLap5SceneX = jumpLap5.getSceneMinLocation().getX();
            int jumpLap5SceneY = jumpLap5.getSceneMinLocation().getY();
            if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Climb","<col=ffff>Rough wall",lap_6,opBlock,jumpLap5SceneX,jumpLap5SceneY,false);
    }
}
else if (treeLap == null && (currentLocation.equals(post_lap_6))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
            GameObject jumpLap6 = v.getGameObject().findNearest(lap_7);
            int jumpLap6SceneX = jumpLap6.getSceneMinLocation().getX();
            int jumpLap6SceneY = jumpLap6.getSceneMinLocation().getY();
                        if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Cross","<col=ffff>Monkeybars",lap_7,opBlock,jumpLap6SceneX,jumpLap6SceneY,false);
             }
}
else if (treeLap == null && (currentLocation.equals(post_lap_7))&& v.getLocalPlayer().hasAnimation(-1) && (!v.getWalking().isMoving() || !v.getWalking().isRunning()))
{
            GameObject jumpLap7 = v.getGameObject().findNearest(lap_8);
            int jumpLap7SceneX = jumpLap7.getSceneMinLocation().getX();
            int jumpLap7SceneY = jumpLap7.getSceneMinLocation().getY();
            if(v.getGroundItem().findNearestRandomized(10, 10, graceId) != null) {
            v.getGroundItem().take(graceId);
             }
             else {
            v.invoke("Jump","<col=ffff>Gap",lap_8,opBlock,jumpLap7SceneX,jumpLap7SceneY,false);
    }
}