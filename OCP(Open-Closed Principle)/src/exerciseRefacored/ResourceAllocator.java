package exerciseRefacored;

public class ResourceAllocator {
	
	public int allocate(Resource resource) {
        return resource.allocate();
    }

    public void free(Resource resource) {
        resource.free();
    }

}
