package org.apache.hadoop.ozone.admin.scm;

import java.util.concurrent.Callable;
import org.apache.hadoop.hdds.cli.HddsVersionProvider;
import org.apache.hadoop.hdds.scm.cli.container.WithScmClient;
import org.apache.hadoop.hdds.scm.client.ScmClient;
import org.apache.hadoop.ozone.admin.OzoneAdmin;
import picocli.CommandLine;

@CommandLine.Command(
    name = "list",
    description = "",
    mixinStandardHelpOptions = true,
    versionProvider = HddsVersionProvider.class)
public class GetScmServiceRolesSubcommand implements Callable<Void> {

  @CommandLine.ParentCommand
  private ScmAdmin parent;

  @Override
  public Void call() throws Exception {
    ScmClient scmClient = parent.createScmClient();
    throw new RuntimeException("implement listleaderstatus");
  }
}
