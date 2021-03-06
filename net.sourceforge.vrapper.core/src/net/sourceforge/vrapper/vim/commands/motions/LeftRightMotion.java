package net.sourceforge.vrapper.vim.commands.motions;

import net.sourceforge.vrapper.vim.commands.BorderPolicy;

public abstract class LeftRightMotion extends AbstractModelSideMotion {

    public BorderPolicy borderPolicy() {
        return BorderPolicy.EXCLUSIVE;
    }

    @Override
    public boolean updateStickyColumn() {
        return true;
    }

	@Override
	protected boolean isLeftRight() {
		return true;
	}

}
