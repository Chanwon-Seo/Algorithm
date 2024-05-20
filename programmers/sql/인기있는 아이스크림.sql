SELECT flavor
from first_half
group by flavor
order by total_order desc, shipment_id;