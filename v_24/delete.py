import os
import glob

def delete_class_files(folder_path):
    # Ensure the folder path exists
    if not os.path.exists(folder_path):
        print(f"The folder {folder_path} does not exist.")
        return

    # Use glob to find all .class files in the folder
    class_files = glob.glob(os.path.join(folder_path, '*.class'))

    # Check if there are any .class files to delete
    if not class_files:
        print("No .class files found in the folder.")
        return

    # Loop through the list of .class files and delete them
    for class_file in class_files:
        try:
            os.remove(class_file)
            print(f"Deleted: {class_file}")
        except Exception as e:
            print(f"Failed to delete {class_file}: {e}")

    print("Deletion process completed.")

# Example usage:
folder_path = 'C:\\Users\\Deves\\OneDrive\\Desktop\\all\\java\\DSA\\VID_24'  # Replace with your folder path
delete_class_files(folder_path)
