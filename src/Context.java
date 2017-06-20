/**
 * 上下文角色，作用是串联各个状态的过渡
 * 在LiftState抽象类中我们定义并把这个上下文角色聚合进来，并传递到子类，
 * 也就是4个具体的实现类中自己根据环境来决定如何进行状态的过渡
 * @author qiaojy
 *
 */
public class Context {

	public final static OpenningState openningState = new OpenningState();
	public final static ClosingState closeingState = new ClosingState();
	public final static RunningState runningState = new RunningState();
	public final static StoppingState stoppingState = new StoppingState();
	
	private LiftState liftState;
	
	public LiftState getLiftState() {
		return liftState;
	}
	
	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		//把当前的环境通知到各个实现类中
		this.liftState.setContext(this);
	}
	
	public void open() {
		this.liftState.open();
	}
	
	public void close() {
		this.liftState.close();
	}
	
	public void run() {
		this.liftState.run();
	}
	
	public void stop() {
		this.liftState.stop();
	}
}
