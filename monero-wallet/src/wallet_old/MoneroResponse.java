package wallet_old;

import java.util.List;

public class MoneroResponse {

	private String id;
	private String jsonrpc;
	private String txKey;
	private List<Integer> fees;
	private List<String> txHashes;
	private MoneroException error;
}