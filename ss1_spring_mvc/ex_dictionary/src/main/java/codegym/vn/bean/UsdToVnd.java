package codegym.vn.bean;

public class UsdToVnd {
    private float usd;
    private float vnd;

    public UsdToVnd() {
    }

    public UsdToVnd(float usd) {
        this.usd = usd;
        this.vnd = usd * 23000;
    }

    public float getUsd() {
        return usd;
    }

    public void setUsd(float usd) {
        this.usd = usd;
    }

    public float getVnd() {
        return vnd;
    }

    public void setVnd(float vnd) {
        this.vnd = vnd;
    }
}
