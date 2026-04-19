
 */
public class SimpleApkV2 {

    private static final byte[] APK_V2_MAGIC = {'A', 'P', 'K', ' ', 'S', 'i', 'g', ' ',
            'B', 'l', 'o', 'c', 'k', ' ', '4', '2'};

    private static int[] getApkSignV2(String path) throws IOException {
        try (
                RandomAccessFile apk = new RandomAccessFile(path, "r")
        ) {
            ByteBuffer bul
