interface Observable{
    public void add(Observer ob);
    public void remove(Observer ob);
    public void setData(int count);
    public int getData();
    public void Notify();
}