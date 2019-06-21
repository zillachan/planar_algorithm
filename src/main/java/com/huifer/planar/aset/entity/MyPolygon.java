package com.huifer.planar.aset.entity;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>Title : MyPolygon </p>
 * <p>Description : 平面</p>
 *
 * @author huifer
 * @date 2018/12/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyPolygon {

    private ArrayList<MyLine> polylines;

}
