package com.example.mvpapplication.presenter;

public class RumusPresenterImp implements  RumusPresenter{
    RumusView rumusView;

    public RumusPresenterImp(RumusView rumusView) {
        this.rumusView = rumusView;
    }

    @Override
    public void hitungLuas(Double panjang, Double lebar) {
        Double luas = panjang * lebar;
        rumusView.hasilLuas(luas);
    }

    @Override
    public void hitungKeliling(Double panjang, Double lebar) {
        Double keliling = 2*(panjang+lebar);
        rumusView.hasilKeliling(keliling);
    }
}

