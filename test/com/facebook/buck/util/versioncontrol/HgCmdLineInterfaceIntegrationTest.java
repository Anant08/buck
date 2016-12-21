import org.junit.Rule;
import org.junit.rules.ExpectedException;

  @Rule
  public ExpectedException exception = ExpectedException.none();

    exception.expect(VersionControlCommandFailedException.class);
    repoThreeCmdLine.diffBetweenRevisions("adf7a0", "adf7a0");
  public void testDiffBetweenDiffs()
    ImmutableList<String> expectedValue = ImmutableList.of(
        "# HG changeset patch",
        "# User Joe Blogs <joe.blogs@fb.com>",
        "# Date 1440589545 -3600",
        "#      Wed Aug 26 12:45:45 2015 +0100",
        "# Node ID 2911b3cab6b24374a3649ebb96b0e53324e9c02e",
        "# Parent  b1fd7e5896af8aa30e3e797ef1445605eec6d055",
        "diverge from master_2",
        "",
        "diff --git a/change2 b/change2",
        "new file mode 100644",
        "");
        String.join("\n", expectedValue),
        repoThreeCmdLine.diffBetweenRevisions("b1fd7e", "2911b3"));