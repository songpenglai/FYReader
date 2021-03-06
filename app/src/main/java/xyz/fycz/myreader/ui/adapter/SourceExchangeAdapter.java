package xyz.fycz.myreader.ui.adapter;

import xyz.fycz.myreader.base.adapter.BaseListAdapter;
import xyz.fycz.myreader.base.adapter.IViewHolder;
import xyz.fycz.myreader.greendao.entity.Book;
import xyz.fycz.myreader.ui.adapter.holder.SourceExchangeHolder;

import java.util.List;

/**
 * @author fengyue
 * @date 2020/9/30 18:42
 */
public class SourceExchangeAdapter extends BaseListAdapter<Book> {
    @Override
    protected IViewHolder createViewHolder(int viewType) {
        return new SourceExchangeHolder();
    }
}
