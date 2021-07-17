public class SecondaryBar {
    private String resourceType;
    private int resourceAmount;

    public SecondaryBar(String resourceType, int resourceAmount){
        this.resourceType = resourceType;
        this.resourceAmount = resourceAmount;
    }

    public String getResourceType() {
        return resourceType;
    }

    public int getResourceAmount() {
        return resourceAmount;
    }
}
