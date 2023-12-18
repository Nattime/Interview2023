package resources;

public class VersionControl{
    private final int version;
    protected VersionControl(int version){
        this.version = version;
    }
    protected boolean isBadVersion(int version){
        return this.version == version;
    }
}
