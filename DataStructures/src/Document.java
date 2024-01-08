import java.text.SimpleDateFormat;
import java.util.*;


public class Document {

    String name;
    String description;
    String createdBy;
    String lastModifiedBy;
    Long sizeInBytes;
    Long createdTime;
    Long modifiedTime;

    // Constructor, getters, and setters

    // Example constructor
    public Document(String name, String description, String createdBy, String lastModifiedBy,
                    Long sizeInBytes, Long createdTime, Long modifiedTime) {
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
        this.sizeInBytes = sizeInBytes;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
    }

    // Getter for formatted size
    public String getFormattedSize() {
        return formatSize(sizeInBytes);
    }

    // Getter for formatted created time
    public String getFormattedCreatedTime() {
        return formatDate(createdTime);
    }

    // Getter for formatted modified time
    public String getFormattedModifiedTime() {
        return formatDate(modifiedTime);
    }


    // Helper method to format size
    private String formatSize(long sizeInBytes) {
        String[] units = {"bytes", "kb", "mb", "gb"};
        int unitIndex = 0;
        double size = sizeInBytes;

        while (size > 1024 && unitIndex < units.length - 1) {
            size /= 1024;
            unitIndex++;
        }

        return String.format("%.2f %s", size, units[unitIndex]);
    }

    // Helper method to format date
    private String formatDate(long timestamp) {
        Date date = new Date(timestamp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    // Helper method to format description
    private String formatDescription(String description) {
        int maxLength = 25;
        if (description.length() <= maxLength) {
            return description;
        } else {
            int lastSpace = description.lastIndexOf(' ', maxLength);
            if (lastSpace == -1){
                return description.substring(0, 25) + "...";
            }
            return description.substring(0, lastSpace) + "...";
        }
    }

    /**pixel 8
     * Prints a report of the list of documents following the specified format.
     *
     * @param documents not null
     */
    public void printDocumentsReport(List<Document> documents) {
        // Group documents by createdBy
        Map<String, List<Document>> groupedByCreatedBy = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for (Document document : documents) {
            groupedByCreatedBy.computeIfAbsent(document.createdBy, k -> new ArrayList<>()).add(document);
        }

        // Print the report
        for (Map.Entry<String, List<Document>> entry : groupedByCreatedBy.entrySet()) {
            System.out.println(entry.getKey());
            for (Document document : entry.getValue()) {
                System.out.printf("\t\"%s\", \"%s\", %s, %s, %s%n",
                        document.name,
                        formatDescription(document.description),
                        formatSize(document.sizeInBytes),
                        formatDate(document.createdTime),
                        document.getFormattedModifiedTime());
            }
        }
    }

    public static void main(String[] args) {
        // Example usage and testing
        List<Document> documents = Arrays.asList(
                new Document("Xray", "How the Xray shows your inner workings. A scientific analysis",
                        "Janet Smith", "John Doe", 48 * 1024 * 1024L, System.currentTimeMillis(), System.currentTimeMillis()),
                new Document("Bobby Timmons Biography", "AnexhaustivelookatthebiographyofBobbyTimmons",
                        "Andy Andrews", "John Doe", 233 * 1024 * 1024L, System.currentTimeMillis(), System.currentTimeMillis()),
                new Document("Apple Sauce", "Study of apple sauces. Apple sauce analysis and properties",
                        "Andy Andrews", "Jane Doe", 87 * 1024 * 1024 * 1024L, System.currentTimeMillis(), System.currentTimeMillis()),
                new Document("Zed", "All matters, A to Zed. Comprehensive guide to everything from A to Zed",
                        "Andy Andrews", "John Doe", 924 * 1024L, System.currentTimeMillis(), System.currentTimeMillis()),
                new Document("Computers", "Inventory list of computers. Detailed information on computer systems",
                        "Janet Smith", "Jane Doe", 423L, System.currentTimeMillis(), System.currentTimeMillis())
        );

        Document document = new Document("", "", "", "", 0L, 0L, 0L);
        document.printDocumentsReport(documents);
    }
}
