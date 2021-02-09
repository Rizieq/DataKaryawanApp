package com.rizieq.datakaryawanapp.Main;

import com.rizieq.datakaryawanapp.model.ResultItem;

import java.util.List;

public interface MainContract {

    // todo selanjutnya
    interface View{
        void showProggress();
        void hideProggress();
        void showKaryawan(List<ResultItem> resultItems);
        void showFailureMessage(String msg);

    }

    interface Presenter{
        void getListKaryawan();
    }
}
