package Sdev1435;

import org.apache.james.cli.ServerCmd;

public class Main
{
  public static void main(String[] args) throws Exception {
    ServerCmd.executeAndOutputToStream(args, System.out);
    //new ServerCmd(null, null, null, null);
  }
}
