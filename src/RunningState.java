
public class RunningState extends LiftState{

	@Override
	public void open() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public void run() {
		System.out.println("电梯正在运行中");
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState);
		super.context.getLiftState().stop();
	}

	
}
