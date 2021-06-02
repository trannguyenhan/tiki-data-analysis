package parse;

import java.io.IOException;

public interface IParseObject {
	public <T> T getData () throws IOException;
}
