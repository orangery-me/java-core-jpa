package model;

public class MyModel {
    private String text;
    private String key;
    private int result;
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void Search(){
        int cnt=0;
        int index=0;
        while (true){
            int i = this.text.indexOf(key, index);
            if (i==-1) break;
            else{
                cnt++;
                index=i+1;
            } 
        }
        this.result=cnt;
    }

}
