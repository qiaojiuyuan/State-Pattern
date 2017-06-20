/**
 * 抽象电梯状态
 * @author qiaojy
 *
 */
public abstract class LiftState {

	//定义一个上下文角色，用于封装状态的变化引起的功能变化
	protected Context context;
	public void setContext(Context context) {
		this.context = context;
	}
	
	public abstract void open();
	public abstract void close();
	public abstract void run();
	public abstract void stop();
}
