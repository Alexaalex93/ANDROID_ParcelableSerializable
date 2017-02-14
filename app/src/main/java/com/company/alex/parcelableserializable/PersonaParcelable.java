package com.company.alex.parcelableserializable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Alex on 14/02/2017.
 */

public class PersonaParcelable implements Parcelable{

    private String nombre;
    private String apellido;
    private int edad;

    public static final Parcelable.Creator<PersonaParcelable> CREATOR = new Parcelable.Creator<PersonaParcelable>(){

        @Override
        public PersonaParcelable createFromParcel(Parcel source) {
            return new PersonaParcelable(source);
        }

        @Override
        public PersonaParcelable[] newArray(int size) {
            return new PersonaParcelable[size];
        }
    };

    public PersonaParcelable (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    //Parcel es un objeto que va a contener la informacion de mi persona
    public PersonaParcelable(Parcel parcel){ //Esto es para desserializar, pasar de parcel a objeto. SI HAY VARIOS ELEMENTOS DE UN MISMO TIPO SE DIFERENCIAN POR EL ORDEN EN QUE LOS LLAMES

        this.nombre = parcel.readString();
        this.apellido = parcel.readString();
        this.edad = parcel.readInt();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i){ //Serializar, pasar de objeto a parcel. EL SEGUNDO PARAMETRO ES UN FLAG, PARA IDENTIFICAR

        parcel.writeString(this.nombre);
        parcel.writeString(this.apellido); //Como lo estoy metiendo en segundo lugar cuando llame al constructor con parcel deberé llamarlo en sgeundo lugar
        parcel.writeInt(this.edad);

    }
}
