package robotBase;

public abstract class Command implements CommandBase{
	@Override
	public abstract void init();
	@Override
	public abstract void exec();
	@Override
	public abstract void end();
	
	public final void start() {
		init();
		exec();
		end();
	}
}
