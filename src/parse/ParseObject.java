package parse;

import java.io.IOException;

public interface ParseObject {
	public <T> T getData () throws IOException;
}
