package com.attextra.grafico.decorator;

import org.jfree.chart.JFreeChart;

public interface IGrafico {

    public JFreeChart getGrafico();

    public double getIntervaloCount(int intervalo);

    public double getIntervaloProporcao(int intervalo);

    public double getAlturaMaximaIntervalo(int intervalo);

    public IGrafico remover();
}
