import static java.nio.charset.StandardCharsets.UTF_8;
import com.google.devtools.build.lib.vfs.FileSystemUtils;
public final class PatchUtilTest {
  private final FileSystem fs = new InMemoryFileSystem(DigestHashFunction.SHA256);
  private final Scratch scratch = new Scratch(fs, "/root");
  public void createRoot() throws Exception {
    assertThat(FileSystemUtils.readLines(newFile, UTF_8)).isEqualTo(newFileContent);
    assertThat(FileSystemUtils.readLines(newFile, UTF_8)).isEqualTo(newFileContent);
    assertThat(FileSystemUtils.readLines(oldFile, UTF_8)).isEmpty();
    assertThat(FileSystemUtils.readLines(oldFile, UTF_8)).isEqualTo(newContent);
    assertThat(FileSystemUtils.readLines(newFile, UTF_8)).containsExactly("line one");
    assertThat(FileSystemUtils.readLines(newFile, UTF_8)).isEqualTo(newContent);
    assertThat(FileSystemUtils.readLines(myFile, UTF_8)).containsExactly("line one");
    assertThat(FileSystemUtils.readLines(foo, UTF_8)).isEqualTo(newFoo);
    assertThat(FileSystemUtils.readLines(bar, UTF_8)).isEqualTo(newBar);
    assertThat(FileSystemUtils.readLines(fooCpp, UTF_8)).isEqualTo(newFoo);
    assertThat(FileSystemUtils.readLines(barCpp, UTF_8)).isEqualTo(newBar);
    assertThat(FileSystemUtils.readLines(foo, UTF_8)).isEqualTo(newFoo);
    assertThat(FileSystemUtils.readLines(foo, UTF_8)).isEqualTo(newFoo);