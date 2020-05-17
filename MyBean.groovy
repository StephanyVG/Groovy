/*JavaBean*/
public class MyBean implements java.io.Serializable {
  private String myProp;
  public String getMyProp(){
    return myProp;
  }
  public void setMyProp(String value){
    myProp = value;
  }
}

/*GroovyBean*/
class MyBean implements Serializable{
  String myProp
}