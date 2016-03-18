import java.util.List;

public class PaginationHelper<I> {

    List<I> collection;
    int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((1.0 * collection.size()) / itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int pageCount = (int) Math.ceil((1.0 * collection.size()) / itemsPerPage);
        if (pageIndex >= pageCount || pageIndex < 0)
            return -1;

        if (pageIndex == pageCount - 1 && collection.size() % itemsPerPage != 0)
            return collection.size() % itemsPerPage;
        else
            return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex >= collection.size() || itemIndex < 0)
            return -1;
        else
            return itemIndex / itemsPerPage;
    }
}