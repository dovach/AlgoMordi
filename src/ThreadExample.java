public class ThreadExample {
	private static boolean doStop = false;
  public static void main(String[] args){
    System.out.println(Thread.currentThread().getName());
    for(int i=0; i<10 && !doStop ; i++){
      new Thread("" + i){
        public void run(){
          System.out.println("Thread: " + getName() + " running");
          if(Integer.parseInt(getName())==8) {
        	  System.out.println("Thread: " + getName() + " activated dostop");
        	  doStop =true; 
          }
          if(Integer.parseInt(getName())== 3) {
				while(!doStop) {
					System.out.println("Thread: " + getName() + " waiting for 8 to stop me");
					try {
			    		  Thread.sleep(10L * 100L);
			    		  System.out.println("Thred: " + Thread.currentThread().getName() +" has slept");
			    		} catch (InterruptedException e) {
			    		    e.printStackTrace();
			    		}
				}
          }
        }
      }.start();
      if(i==5) {
    	  try {
    		  Thread.sleep(10L * 500L);
    		  System.out.println("Thred: " + Thread.currentThread().getName() +" has slept");
    		} catch (InterruptedException e) {
    		    e.printStackTrace();
    		}
      }
    }
  }
}
