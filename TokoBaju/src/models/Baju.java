package models;

import java.sql.SQLException;

import database.Database;

public class Baju extends Database {
    // Constructor untuk Connect ke Database
    public Baju() throws ClassNotFoundException, SQLException {
        super();
    }

    // Create
    public void insert(String nama, String jenis, int harga) throws SQLException {
        String sql = String.format("INSERT INTO tokobaju (merk, jenis, harga) VALUE ('%s', '%s', %d)", nama, jenis,
                harga);
        this.setQuery(sql);
        this.execute();
    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM tokobaju";
        this.setQuery(sql);
        this.take();
    }
    
    // Update
    public void update(int id, String merk, String jenis, int harga) throws SQLException {
        String sql = String.format("UPDATE tokobaju SET merk = '%s', jenis = '%s', harga = %d WHERE id = %d",
                merk, jenis, harga, id);
        this.setQuery(sql);
        this.execute();
    }

    // Delete
    public void delete(int id) throws SQLException {
        String sql = String.format("DELETE FROM tokobaju WHERE id = %d", id);
        this.setQuery(sql);
        this.execute();
    }

    // Validation untuk mencegah redudansi data
    public boolean check(String merk) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (this.value.getString("merk").equals(merk)) {
                return false;
            }
        }
        return true;
    }

    public String[][] show() throws SQLException {
        String[][] data = new String[this.len()][4];
        getAll();
        this.take();
        int i = 0;
        while (this.value.next()) {
            data[i][0] =  Integer.toString(this.value.getInt("id"));
            data[i][1] = this.value.getString("merk");
            data[i][2] = this.value.getString("jenis");
            data[i][3] = Integer.toString(this.value.getInt("harga"));
            i++;
        }
        return data;
    }
    
    public int len() throws SQLException {
        getAll();
        this.take();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }
}
