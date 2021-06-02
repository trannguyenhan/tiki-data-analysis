package kafka;

import models.Product;

public interface ITaskProducer extends ITask{
	void send(String topic, Product data);
}
