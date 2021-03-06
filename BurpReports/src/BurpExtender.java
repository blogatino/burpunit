import burp.IBurpExtender;
import burp.IBurpExtenderCallbacks;
import burp.IHttpRequestResponse;
import burp.IScanIssue;
import com.burpreports.BurpReports;

/*
 * BurpExtender delegate
 */
/**
 *
 * @author runtz
 */
public class BurpExtender implements IBurpExtender {

    private BurpReports burpReports = new BurpReports();

    @Override
    public void setCommandLineArgs(String[] args) {
        burpReports.setCommandLineArgs(args);
    }

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        burpReports.registerExtenderCallbacks(callbacks);
    }

    @Override
    public void processHttpMessage(String toolName, boolean messageIsRequest, IHttpRequestResponse messageInfo) {
        burpReports.processHttpMessage(toolName, messageIsRequest, messageInfo);
    }

    @Override
    public void newScanIssue(IScanIssue issue) {
        burpReports.newScanIssue(issue);
    }

    @Override
    public void applicationClosing() {
        burpReports.applicationClosing();
    }

    @Override
    public byte[] processProxyMessage(int messageReference, boolean messageIsRequest, String remoteHost, int remotePort, boolean serviceIsHttps, String httpMethod, String url, String resourceType, String statusCode, String responseContentType, byte[] message, int[] action) {
        return new byte[0];
    }
}
