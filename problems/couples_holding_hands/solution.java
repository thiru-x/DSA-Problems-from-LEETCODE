class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int swaps = 0;

        // position[i] = current seat of person i
        int[] position = new int[n];

        for (int i = 0; i < n; i++) {
            position[row[i]] = i;
        }

        for (int i = 0; i < n; i += 2) {

            int firstPerson = row[i];
            int partner = firstPerson ^ 1;

            // If partner already beside firstPerson
            if (row[i + 1] == partner) {
                continue;
            }

            // Current position of partner
            int partnerPos = position[partner];

            // Person sitting at i+1
            int wrongPerson = row[i + 1];

            // Swap
            row[i + 1] = partner;
            row[partnerPos] = wrongPerson;

            // Update positions
            position[partner] = i + 1;
            position[wrongPerson] = partnerPos;

            swaps++;
        }

        return swaps;
    }
}